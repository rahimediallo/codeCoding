package com.javascript;


   function solution(s) {
  const words = s.split(' ');
        words.forEach(word => {
                console.log(word);
  });
    }

    solution('Hello you !');




}


function nextWeek(date) {
  const nextWeekDate = new Date(date.getTime() + 7 * 24 * 60 * 60 * 1000); // Ajoute 7 jours en millisecondes

  return nextWeekDate;
}

// Exemple d'utilisation
const currentDate = new Date();
const nextWeekDate = nextWeek(currentDate);
console.log(nextWeekDate);


function average(table) {
  if (table.length === 0) {
    return 0; // Retourne 0 si le tableau est vide
  }

  var sum = 0;
  for (var i = 0; i < table.length; i++) {
    sum += table[i];
  }

  var avg = sum / table.length;
  return avg;
}


function solve(width, height, nbBlocks, grid) {
  // Trouver le bloc avec le numéro le plus à droite
  let maxRightBlock = -1;
  let maxRightColumn = -1;

  for (let row = 0; row < height; row++) {
    for (let col = width - 1; col >= 0; col--) {
      const cell = grid[row][col];
      if (cell !== '.' && cell !== 'X') {
        const blockNum = parseInt(cell);
        if (col > maxRightColumn) {
          maxRightColumn = col;
          maxRightBlock = blockNum;
        }
      }
    }
  }

  return maxRightBlock;
}


// computer size of disque

function computeSizeOnDisk(clusterSize, fileSize) {
  const clusters = Math.ceil(fileSize / clusterSize);
  return clusters * clusterSize;
}



  function trySolution(fileSizeOnDisk) {
   console.log('' + JSON.stringify(fileSizeOnDisk));
  }

  trySolution(computeSizeOnDisk(
          JSON.parse(readline()),
        JSON.parse(readline())
        ));