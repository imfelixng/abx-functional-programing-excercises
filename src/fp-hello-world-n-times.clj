;;https://www.hackerrank.com/challenges/fp-hello-world-n-times
(defn hello_word_n_times[x]
    (dotimes [n x]
        (print (str "Hello World\n"))
    )
)

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)