public int diff21(int n) {
    if (n <= 21) {
        return 21 - n;
    } else {
        return (n - 21) * 2;
    }
}
  /*int diff =  21 - n ;


  if (n >21){
    diff = diff + diff;

    return n * 2;
  }

  return diff;
}
*/