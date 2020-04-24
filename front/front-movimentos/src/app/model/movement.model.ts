import { ProductCosif } from './productCosif.model';
import { Product } from './product.model';
export class Movement {
    numLancamento: number;
    datMes: number;
    datAno: number;
    product: Product;
    productCosif: ProductCosif;
    valValor: number;
    desDescription: string;
    datMovement: Date;
    codUser: string;
    constructor() {
      this.product = new Product();
      this.productCosif = new ProductCosif();
    }
}
