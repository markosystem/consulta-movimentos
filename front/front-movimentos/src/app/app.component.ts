import { ProductCosif } from './model/productCosif.model';
import { Product } from './model/product.model';
import { ProductCosifService } from './service/productCosif.service';
import { ProductService } from './service/product.service';
import { MovementService } from './service/movement.service';
import { Movement } from './model/movement.model';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'front-movimentos';
  movements: Movement[];
  products: Product[];
  productsCosif: ProductCosif[];
  entity: Movement = new Movement();
  // tslint:disable-next-line: no-inferrable-types
  msg: string = '';

  // tslint:disable-next-line: max-line-length
  constructor(private service: MovementService, private productService: ProductService, private productCosifService: ProductCosifService, private route: ActivatedRoute, private _snackBar: MatSnackBar, private router: Router) {

  }

  ngOnInit() {
    this.all();
    this.allProducts();
    this.allProductsCosif();
  }

  onSubmit() {
    this.service.save(this.entity).subscribe(
      req => {
        this.showMessage('Movimento realizado com sucesso¡');
        this.entity = new Movement();
        this.ngOnInit();
      },
      error => {
        this.msg = `Ops, ocorreu um erro de interno, por favor, tente novamente!`;
        console.error(error);
        this.showMessage(this.msg);
      }
    );
  }

  all() {
    this.service.all().subscribe(
      req => {
        this.movements = req;
      },
      error => {
        this.msg = `Ops, ocorreu um erro ao buscar as Movimentações!`;
        console.log(this.msg);
        this.showMessage(this.msg);
      }
    );
  }

  allProducts() {
    this.productService.all().subscribe(
      req => {
        this.products = req;
      },
      error => {
        this.msg = `Ops, ocorreu um erro ao buscar os Produtos!`;
        console.log(this.msg);
        this.showMessage(this.msg);
      }
    );
  }

  allProductsCosif(){
    this.productCosifService.all().subscribe(
      req => {
        this.productsCosif = req;
      },
      error => {
        this.msg = `Ops, ocorreu um erro ao buscar os Products Cosif!`;
        console.log(this.msg);
        this.showMessage(this.msg);
      }
    );
  }

  showMessage(message: string) {
    this._snackBar.open(message, 'Fechar', {
      duration: 4000,
    });
  }

}
