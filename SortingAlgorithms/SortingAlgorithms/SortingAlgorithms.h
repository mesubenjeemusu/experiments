#ifndef SORTING_ALGORITHMS_H
#define SORTING_ALGORITHMS_H

namespace Sorting {
	template<typename T>
	void BubbleSort(std::vector<T> vec);

	template<typename T>
	void InsertionSort(std::vector<T> vec);

	template<typename T>
	void SelectionSort(std::vector<T> vec);

	template<typename T>
	void MergeSort(std::vector<T> vec);

	template<typename T>
	void QuickSort(std::vector<T> vec);

	template<typename T>
	static inline void PrintVector(const std::vector<T> vec)
	{
		std::cout << "list: ";

		for (T item : vec)
		{
			std::cout << "[" << item << "] ";
		}

		std::cout << std::endl;
	}

	template<typename T>
	static inline void SwapVector(std::vector<T> &vec, int leftIndex, int rightIndex)
	{
		std::cout << "Swap Vector - index " << leftIndex << " (" << vec[leftIndex] << ") with index " << rightIndex << " (" << vec[rightIndex] << ")" << std::endl;
		std::swap(vec[leftIndex], vec[rightIndex]);
	}

	class Timer
	{
	public:
		Timer()
		{
			m_duration = 0.0;
		}

		inline void StartTimer()
		{
			m_start = std::clock();
		}

		inline double StopTimer()
		{
			return m_duration = (std::clock() - m_start) / (double) CLOCKS_PER_SEC;
		}

		inline double GetLastDuration()
		{
			return m_duration;
		}

	private:
		std::clock_t m_start;
		double m_duration;
	};
}
#endif