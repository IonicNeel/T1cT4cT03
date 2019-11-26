package com.yeet.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {
    int chances = 1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int[][] grid = new int[3][3];
    int i = 0, j = 0;
    // 1 - cross   2 - circle

    {
        while (i < 3) {
            while (j < 3) {
                grid[i][j] = -1;
                j++;
            }
            i++;
        }
    }


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            setContentView(R.layout.game);

            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b5 = findViewById(R.id.b5);
            b6 = findViewById(R.id.b6);
            b7 = findViewById(R.id.b7);
            b8 = findViewById(R.id.b8);
            b9 = findViewById(R.id.b9);
            b1.setClickable(true);
            b2.setClickable(true);
            b3.setClickable(true);
            b4.setClickable(true);
            b5.setClickable(true);
            b6.setClickable(true);
            b7.setClickable(true);
            b8.setClickable(true);
            b9.setClickable(true);


            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b1.setText("X");
                        b1.setClickable(false);
                        chances++;
                        grid[0][0] = 1;
                    } else {
                        b1.setText("O");
                        b1.setClickable(false);
                        chances++;
                        grid[0][0] = 2;
                    }

                    if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    }
                }
            });


            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b2.setText("X");
                        b2.setClickable(false);
                        chances++;
                        grid[0][1] = 1;
                    } else {
                        b2.setText("O");
                        b2.setClickable(false);
                        chances++;
                        grid[0][1] = 2;
                    }

                    if (grid[0][1] == grid[0][0] && grid[0][1] == grid[0][2]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    }
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b3.setText("X");
                        b3.setClickable(false);
                        chances++;
                        grid[0][2] = 1;
                    } else {
                        b3.setText("O");
                        b3.setClickable(false);
                        chances++;
                        grid[0][2] = 2;
                    }

                    if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
                        if (grid[0][2] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
                        if (grid[0][2] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
                        if (grid[1][1] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    }

                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b4.setText("X");
                        b4.setClickable(false);
                        chances++;
                        grid[1][0] = 1;
                    } else {
                        b4.setText("O");
                        b4.setClickable(false);
                        chances++;
                        grid[1][0] = 2;
                    }

                    if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
                        if (grid[1][0] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[1][0] == grid[0][0] && grid[1][0] == grid[2][0]) {
                        if (grid[1][0] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    }

                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b5.setText("X");
                        b5.setClickable(false);
                        chances++;
                        grid[1][1] = 1;
                    } else {
                        b5.setText("O");
                        b5.setClickable(false);
                        chances++;
                        grid[1][1] = 2;
                    }
                    if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
                        if (grid[1][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[1][1] == grid[0][1] && grid[1][1] == grid[2][1]) {
                        if (grid[1][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
                        if (grid[1][1] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    }

                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b6.setText("X");
                        b6.setClickable(false);
                        chances++;
                        grid[1][2] = 1;
                    } else {
                        b6.setText("O");
                        b6.setClickable(false);
                        chances++;
                        grid[1][2] = 2;
                    }

                    if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
                        if (grid[1][0] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[1][2] == grid[0][2] && grid[1][2] == grid[2][2]) {
                        if (grid[1][2] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    }

                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b7.setText("X");
                        b7.setClickable(false);
                        chances++;
                        grid[2][0] = 1;
                    } else {
                        b7.setText("O");
                        b7.setClickable(false);
                        chances++;
                        grid[2][0] = 2;
                    }

                    if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
                        if (grid[2][0] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
                        if (grid[2][0] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
                        if (grid[1][1] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    }

                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b8.setText("X");
                        b8.setClickable(false);
                        chances++;
                        grid[2][1] = 1;
                    } else {
                        b8.setText("O");
                        b8.setClickable(false);
                        chances++;
                        grid[2][1] = 2;
                    }

                    if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
                        if (grid[2][0] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    }

                }
            });

            b9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (chances % 2 == 1) {
                        b9.setText("X");
                        b9.setClickable(false);
                        chances++;
                        grid[2][2] = 1;
                    } else {
                        b9.setText("O");
                        b9.setClickable(false);
                        chances++;
                        grid[2][2] = 2;
                    }

                    if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
                        if (grid[0][2] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    } else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
                        if (grid[2][0] == 1) {
                            //player 1 wins
                        } else {
                            //player 2 wins
                        }
                    } else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
                        if (grid[0][1] == 1) {
                            //player 1 wins
                        } else {
                            // player 2 wins
                        }
                    }

                }
            });


        }


}