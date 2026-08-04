<h2><a href="https://www.geeksforgeeks.org/problems/fraction-trouble3803/1">Closest Smaller Fraction</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a fraction in the form <strong data-start="45" data-end="52">n/d</strong>, where <strong data-start="60" data-end="77">gcd(n, d) = 1</strong> and <strong data-start="82" data-end="91">n ≤ d</strong>,&nbsp;find the largest possible fraction that is strictly less than <strong data-start="171" data-end="178">n/d</strong>, also in reduced form (i.e., the numerator and denominator must be coprime), and where the numerator is less than or equal to the denominator.&nbsp;&nbsp;<br><br><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 1, d = 8
<strong>Output: </strong>1249 9993
<strong>Explanation: </strong>1/8 &gt;= 1249/9993 and this is the largest fraction. </span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2, d = 53
<strong>Output: </strong>377 9991
<strong>Explanation: </strong>2/53 &gt;= 377/9991 and this is the largest fraction.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 1, d = 1
<strong>Output: </strong>9999 10000
<strong>Explanation: </strong>The constraints allow the maximum value of n or d to be 10^4</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:&nbsp;</strong><br>1 ≤ n ≤ d ≤ 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;