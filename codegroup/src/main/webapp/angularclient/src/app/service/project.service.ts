import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Project } from '../model/project';
import { Observable } from 'rxjs';

@Injectable()
export class ProjectService {

  private projectsUrl: string;

  constructor(private http: HttpClient) {
    this.projectsUrl = 'http://localhost:8080/project';
  }

  public findAll(): Observable<Project[]> {
    return this.http.get<Project[]>(this.projectsUrl);
  }

  public save(project: Project) {
    return this.http.post<Project>(this.projectsUrl, project);
  }
}
