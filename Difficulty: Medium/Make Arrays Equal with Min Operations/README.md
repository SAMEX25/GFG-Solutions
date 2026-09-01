<h2><a href="https://www.geeksforgeeks.org/problems/unequal-arrays--170647/1">Make Arrays Equal with Min Operations</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p data-start="505" data-end="626"><span style="font-size: 14pt;">Given two integer arrays <strong>a[] </strong>and <strong>b[]</strong> of equal length, you may perform the following operation on a[] any number of times:</span></p>
<ul data-start="628" data-end="722">
<li data-section-id="1eklwqi" data-start="628" data-end="670"><span style="font-size: 14pt;">Choose two distinct indices i and j.</span></li>
<li data-section-id="2nvy05" data-start="671" data-end="696"><span style="font-size: 14pt;">Increase a[i] by 2.</span></li>
<li data-section-id="170hz0g" data-start="697" data-end="722"><span style="font-size: 14pt;">Decrease a[j] by 2.</span></li>
</ul>
<p><span style="font-size: 14pt;">Two arrays are considered equal if,</span></p>
<ul>
<li><span style="font-size: 14pt;">They have same elements with same individual frequencies</span></li>
<li><span style="font-size: 14pt;">The order of elements maybe different</span></li>
</ul>
<p data-start="724" data-end="799"><span style="font-size: 14pt;">Return the minimum number of operations required to make a[] and b[] equal. Return -1 if it is impossible.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [2, 5, 6], b[] = [1, 2, 10]
<strong>Output:</strong> 2
<strong>Explanation</strong>: </span><span style="font-size: 18px;">Select i = 2 and j = 1. Now a[] = [2, 5-2, 6+2]. Again select i = 2 and j = 1. Now a[] = [2, 3-2, 8+2]. Both arrays now contain the same elements, so the minimum number of operations required is 2. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: a[] = [3, 3], b[] = [9, 8]
<strong>Output:</strong> -1
<strong>Explanation</strong>: </span><span style="font-size: 14pt;">It is impossible to make the two arrays equal using the given operation.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">1 ≤ a.size(), b.size() ≤ 10<sup>5<br></sup></span><span style="font-size: 18px;">−10<sup>4</sup> ≤ a[i], b[i] ≤ 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>logical-thinking</code>&nbsp;