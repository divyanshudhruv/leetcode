/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only. 
*/

function lengthOfLastWord(s: string): number {
    let trimmed = s.trim();
    let lastSpaceIndex = trimmed.lastIndexOf(" ");
    return trimmed.length - lastSpaceIndex - 1;
}
