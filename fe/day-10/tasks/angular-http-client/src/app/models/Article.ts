import { IArticle } from "./IArticle";

export class Article implements IArticle {
    constructor(
        public id?: number,
        public title?: string,
        public description?: string
    ) { }
}