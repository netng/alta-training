export interface IBaseArticle {
    title: string;
    description: string;
}

export interface IArticle extends IBaseArticle {
    id: number;
}