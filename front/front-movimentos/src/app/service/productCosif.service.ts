import { ProductCosif } from './../model/productCosif.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AbstractService } from './abstract.service';

@Injectable({
  providedIn: 'root'
})
export class ProductCosifService extends AbstractService {
  // tslint:disable-next-line: variable-name
  readonly url_complete = this.url.concat('v1/produtos_cosif');

  constructor(private http: HttpClient) {
    super();
  }

  all(): Observable<ProductCosif[]> {
    return this.http.get<ProductCosif[]>(this.url_complete);
  }
}
