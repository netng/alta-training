export interface IBaseArticle {
    title: string;
    description: string;
    is_published: number;
}

export interface IArticle extends IBaseArticle {
    id: number;
}