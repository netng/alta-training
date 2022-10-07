import { TestBed } from '@angular/core/testing';

import { ArticleRestApiServiceTsService } from './article-rest-api.service.ts.service';

describe('ArticleRestApiServiceTsService', () => {
  let service: ArticleRestApiServiceTsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArticleRestApiServiceTsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
