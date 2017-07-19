module Main where

resto n = if n - 2 * (n/2) == 0 
            then print "O valor de N e Impar " (resto n)
            else print "O valor de N e Par " (resto n)
main :: IO ()
main = do putStrLn "Digite uma numero"
          let resultdao =  resto n <- readLn
         
