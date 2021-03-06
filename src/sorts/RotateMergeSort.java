package sorts;

import templates.GrailSorting;
import utils.Delays;
import utils.Highlights;
import utils.Reads;
import utils.Writes;

/*
 * 
The MIT License (MIT)

Copyright (c) 2013 Andrey Astrelin

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

/********* Classic in-place merge ********/
/*                                       */
/* (c) 2013 by Andrey Astrelin           */
/* Refactored by MusicTheorist           */
/*                                       */
/* Classic implementation of in-place    */
/* merge sort; uses binary search and    */
/* rotations                             */
/*                                       */
/* Copied from GrailSort.h               */
/*                                       */
/*****************************************/

final public class RotateMergeSort extends GrailSorting {
    public RotateMergeSort(Delays delayOps, Highlights markOps, Reads readOps, Writes writeOps) {
        super(delayOps, markOps, readOps, writeOps);
        
        this.setSortPromptID("Rotate Merge");
        this.setRunAllID("Rotate Merge Sort");
        //this.setRunAllID("In-Place Merge Sort with Rotations");
        this.setReportSortID("In-Place Rotate Mergesort");
        this.setCategory("Merge Sorts");
        this.isComparisonBased(true);
        this.isBucketSort(false);
        this.isRadixSort(false);
        this.isUnreasonablySlow(false);
        this.setUnreasonableLimit(0);
        this.isBogoSort(false);
    }
    
    public void customRotateMerge(int[] array, int start, int end) {
        this.grailInPlaceMergeSort(array, start, end);
    }
    
    @Override
    public void runSort(int[] array, int length, int bucketCount) {
        this.grailInPlaceMergeSort(array, 0, length);
    }
}