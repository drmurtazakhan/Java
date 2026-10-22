interface Generator{
   /* Used to reset the generator to the beginning of the sequence; 
      the current value can be immediately retrieved with get()
   */
   void reset();

   /* generates the next value in the sequence.
   */
   void next();

   /* returns the current value of the generator.
   */
   int get();
}

