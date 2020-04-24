import { Observable } from 'rxjs';
import { Movement } from './../model/movement.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';

@Injectable({
  providedIn: 'root'
})
export class MovementService extends AbstractService {
  // tslint:disable-next-line: variable-name
  readonly url_complete = this.url.concat('v1/movimentos');

  constructor(private http: HttpClient) {
    super();
  }

  all(): Observable<Movement[]> {
    return this.http.get<Movement[]>(this.url_complete);
  }

  save(movement: Movement) {
    return this.http.post(this.url_complete, movement, this.httpOptions);
  }

}
