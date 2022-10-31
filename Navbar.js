import React, { Component } from 'react';
import './Navbar.css';
import logo from './icon.png';

 class Navbar extends Component {
    
    render() {
        return (
            <div id="d">
                <nav class="navbar navbar-expand-lg navbar-light ">
                    <img src={logo} alt="Logo" />
                    <a class="navbar-brand" href="#" id="h1">Daietto</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarText">
                        <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#" id="link">Nosotrous <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" id="link">Menu</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" id="link">Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" id="link">About</a>
                        </li>
                        </ul>
                        <a class="nav-link" href="#" id="span1">Login</a>
                        <a class="nav-link" href="#" id="span2">Register</a>
                    </div>
                </nav>
            </div>
        )
    }
}

export default Navbar
