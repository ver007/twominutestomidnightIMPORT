class 
    INTERFACE

creation
    make
--PROBLEM WITH INPUT, NEED SOME KIND OF SCREEN FLUSH
feature
    make is
       local
           board: BOARD
           size : INTEGER
           c : CHARACTER
           quit : BOOLEAN
           move : INTEGER
        do
           print("Soup")
           print("%NPlease input board size: ")
           io.read_integer
           size := io.last_integer
           !!board.make(size);
           from
            move := 0 
            quit := False
           until
            board.won() or quit
           loop
            move := move + 1
            board.print_out
            io.put_string("Press q to quit at anytime%N")
            io.put_string("Which way would you like to move? up(k), down(j), left(h), right(l): ")
            io.read_character
            c := io.last_character
            io.put_new_line
            --Need someway to clear the screen
            if c = 'k' then
              board.move_up
            elseif c = 'j' then
              board.move_down
            elseif c = 'h' then
              board.move_left
            elseif c = 'l' then
              board.move_right
            elseif c = 'q' then
              quit := True
              move := move - 1
            end
            io.put_integer(move)
           end --end loop. Why is it looping twice....
        board.print_out
--        io.put_string("Number of moves: ")
--        io.put_integer(move)
        end
end
           
