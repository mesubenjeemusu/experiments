#include <vector>
#include <iostream>
#include <ctime>
#include "SortingAlgorithms.h"

namespace Sorting {
	template<typename T>
	void BubbleSort(std::vector<T> vec)
	{
		bool swapNeeded = true;
		int listIterCount = 0;
		int totalSwapsNeeded = 0;
		while (swapNeeded)
		{
			listIterCount++;
			swapNeeded = false;
			int swapsNeededThisPass = 0;

			std::cout << "Pass No. " << listIterCount << std::endl;

			for (size_t i = 0; i < vec.size() - 1; i++)
			{
				if (vec[i] > vec[i + 1])
				{
					SwapVector(vec, i, i + 1);
					swapsNeededThisPass++;
					swapNeeded = true;
				}
			}

			totalSwapsNeeded += swapsNeededThisPass;
			std::cout << "Swaps needed this pass: " << swapsNeededThisPass << std::endl;
		}

		std::cout << "List Sorted." << std::endl;
		Sorting::PrintVector(vec);
		std::cout << "Total list iterations needed: " << listIterCount << std::endl;
		std::cout << "Total swaps needed: " << totalSwapsNeeded << "\r\n" << std::endl;
	}

	template<typename T>
	void InsertionSort(std::vector<T> vec)
	{
		int totalSwapsNeeded = 0;

		std::cout << "Only ever one pass needed with insertion sort" << std::endl;

		for (size_t i = 1; i < vec.size(); i++)
		{
			size_t j = i;
			while (j > 0 && vec[j] < vec[j - 1])
			{
				// swap
				SwapVector(vec, j, j - 1);
				totalSwapsNeeded++;
				j--;
			}
		}

		std::cout << "List Sorted." << std::endl;
		Sorting::PrintVector(vec);
		std::cout << "Total swaps needed: " << totalSwapsNeeded << "\r\n" << std::endl;
	}
}