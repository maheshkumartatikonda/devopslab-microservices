import logo from './logo.svg';
import './App.css';

import React, { useEffect, useState } from 'react';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [products, setProducts] = useState([]);

  // Fetch products from Java Backend on load
  useEffect(() => {
    axios.get('http://localhost:8080/products')
      .then(response => setProducts(response.data))
      .catch(error => console.error('Error fetching data:', error));
  }, []);

  return (
    <div className="container mt-5">
      <h1>Product Catalog</h1>
      <ul className="list-group">
        {products.map(product => (
          <li key={product.id} className="list-group-item">
            {product.name} - ${product.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;