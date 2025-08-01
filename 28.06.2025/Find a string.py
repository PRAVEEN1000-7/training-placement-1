def count_substring(string, sub_string):
    count = 0
    sub_len = len(sub_string)
    
    # Check each possible starting position in the string
    for i in range(len(string) - sub_len + 1):
        # Check if substring matches at current position
        if string[i:i + sub_len] == sub_string:
            count += 1
    
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
