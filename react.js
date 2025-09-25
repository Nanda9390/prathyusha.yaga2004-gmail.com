import React from 'react';
class ColorfulCounter extends React.Component{
state={count:0};
increment=()=>this.setState({count:this.state.count+1});
decrement=()=>this.setState({count:this.state.count-1});
reset=()=>this.setState({count:0});
render(){
return(
<div style={{textAlign:'center',marginTop:'50px'}}>
<h1 style={{color:'#333'}}>Count:{this.state.count}</h1>
<button
onClick={this.increment}
style={styles.incrementButton}
>
+
</button>
<button
onClick={this.decrement}
style={styles.decrementButton}
>
</button>
<button
onClick={this.reset}
style={styles.resetButton}
>
Reset
</button>
</div>
);
}
}
const styles={
incrementButton:{
backgroundcolor:'#4CAF50',
color:'white',
padding:'10px 20px',
margin:'0 5px',
border:'none',
borderRAdius:'5px',
fontsize:'16px',
cursor:'pointer'
},
decrementButton:{
backgroundcolor:'#f44336',
color:'white',
padding:'10px 20px',
margin:'0 5px',
border:'none',
borderRAdius:'5px',
fontsize:'16px',
cursor:'pointer'
},
resetButton:{
backgroundcolor:'#2196F3',
color:'white',
padding:'10px 20px',
margin:'0 5px',
border:'none',
borderRAdius:'5px',
fontsize:'16px',
cursor:'pointer'}
};
