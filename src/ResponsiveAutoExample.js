import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import shoe from './img/shoe.png';
import { useState } from 'react';
import data from './data.js'

function ResponsiveAutoExample() {
    let [shoes] = useState(data)
  return (
    <Container>
      <Row>
        <Col sm>
         <img src='https://codingapple1.github.io/shop/shoes1.jpg' width="80%"/>
         <h4>{shoes[0].title}</h4>
         <p>{shoes[0].price}원</p>
        </Col>
        {/* 숙제 : col 하나를 컴포넌트화하기 그리고 map으로 간략하게 하기*/}
        <Col sm>
        <img src='https://codingapple1.github.io/shop/shoes2.jpg'  width="80%"/>
        <h4>{shoes[1].title}</h4>
         <p>{shoes[1].price}원</p>
        </Col>
        <Col sm>
        <img src='https://codingapple1.github.io/shop/shoes3.jpg'  width="80%"/>
        <h4>{shoes[2].title}</h4>
         <p>{shoes[2].price}원</p>
        </Col>
        <Col sm>
        <img src={shoe} width="80%"/>
        <h4>Converse</h4>
         <p>100000원</p>
        </Col>
      </Row>
    </Container>
  );
}

export default ResponsiveAutoExample;