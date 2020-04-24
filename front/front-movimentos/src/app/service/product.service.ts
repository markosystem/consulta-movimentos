import { Observable } from 'rxjs';
import { Product } from './../model/product.model';
import { Movement } from '../model/movement.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';

@Injectable({
  providedIn: 'root'
})
export class ProductService extends AbstractService {
  // tslint:disable-next-line: variable-name
  readonly url_complete = this.url.concat('v1/produtos');

  constructor(private http: HttpClient) {
    super();
  }

  all(): Observable<Product[]> {
    return this.http.get<Product[]>(this.url_complete);
  }

}
