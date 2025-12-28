import { Routes } from '@angular/router';
import { TareasComponent } from './tareasMain/tareas.component';

export const routes: Routes = [
    { path: '', redirectTo: 'inicio', pathMatch: 'full' },
    { path: 'inicio', component: TareasComponent },
];
