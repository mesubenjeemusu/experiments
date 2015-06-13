#include <iostream>
#include <stdlib.h>
#include <utility>
#include <vector>
#include "SortingAlgorithms.cpp"

void main()
{
	int vecMaxSize = 100;
	Sorting::Timer timer;
	std::vector<int> intVectorSorted(vecMaxSize);
	std::vector<int> intVectorUnsorted(vecMaxSize);
	std::vector<int> intVectorUnsortedSimple { 8, 9, 5, 9, 7, 2, 0, 3 };

	for (int i = 0; i < vecMaxSize; i++)
	{
		intVectorSorted.at(i) = i + 1;
		intVectorUnsorted.at(i) = rand();
	}

	/*timer.StartTimer();
	Sorting::BubbleSort(intVectorSorted);
	std::cout << "Time for sorted list bubble sort (100 items): " << timer.StopTimer() << std::endl;

	timer.StartTimer();
	Sorting::BubbleSort(intVectorUnsorted);
	std::cout << "Time for unsorted list bubble sort (100 item): " << timer.StopTimer() << std::endl;*/

	timer.StartTimer();
	Sorting::InsertionSort(intVectorSorted);
	std::cout << "Time for list insertion sort (100 item): " << timer.StopTimer() << std::endl;

	timer.StartTimer();
	Sorting::InsertionSort(intVectorUnsorted);
	std::cout << "Time for unsorted list insertion sort (100 item): " << timer.StopTimer() << std::endl;
}