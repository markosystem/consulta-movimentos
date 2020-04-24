import { HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';

export class AbstractService {
    url = `http://localhost:8080/`;

    httpOptions = {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };

    log(message: string) {
        console.log(`MovimentService: ${message}`)
    }

    handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
            this.log(`${operation} failed: ${error.message}`);
            return of(result as T);
        };
    }
}
