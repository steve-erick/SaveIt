import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from './components/navbar/navbar';
import { Sidebar } from './components/sidebar/sidebar';
import { Panel } from './components/panel/panel';
@Component({
  selector: 'app-root',
  imports: [Navbar,Sidebar,Panel],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'SaveIt';
}
