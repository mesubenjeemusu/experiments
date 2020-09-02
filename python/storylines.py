import sys
from urllib.request import urlopen
url = "http://sixty-north.com/c/t.txt"


def FetchStoryLines(url):
    story = urlopen(url)
    story_words = []
    for line in story:
        line_words = line.decode('utf8').split()
        for word in line_words:
            story_words.append(word)

    story.close()
    return story_words


def PrintItems(items):
    for item in items:
        print(item)


def Main(url):
    words = FetchStoryLines(url)
    PrintItems(words)


if __name__ == "__main__":
    Main(sys.argv[1])