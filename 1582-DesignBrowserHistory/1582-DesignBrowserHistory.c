// Last updated: 7/28/2026, 5:09:20 PM
#define MAX 5000
#define URL_LEN 100

typedef struct {
    char backStack[MAX][URL_LEN];
    char forwardStack[MAX][URL_LEN];
    int backTop;
    int forwardTop;
    char current[URL_LEN];
} BrowserHistory;

BrowserHistory* browserHistoryCreate(char* homepage) {
    BrowserHistory* obj = (BrowserHistory*)malloc(sizeof(BrowserHistory));
    obj->backTop = -1;
    obj->forwardTop = -1;
    strcpy(obj->current, homepage);
    return obj;
}

void browserHistoryVisit(BrowserHistory* obj, char* url) {
    strcpy(obj->backStack[++obj->backTop], obj->current);
    strcpy(obj->current, url);
    obj->forwardTop = -1;   // clear forward history
}

char* browserHistoryBack(BrowserHistory* obj, int steps) {
    while (steps-- > 0 && obj->backTop >= 0) {
        strcpy(obj->forwardStack[++obj->forwardTop], obj->current);
        strcpy(obj->current, obj->backStack[obj->backTop--]);
    }
    return obj->current;
}

char* browserHistoryForward(BrowserHistory* obj, int steps) {
    while (steps-- > 0 && obj->forwardTop >= 0) {
        strcpy(obj->backStack[++obj->backTop], obj->current);
        strcpy(obj->current, obj->forwardStack[obj->forwardTop--]);
    }
    return obj->current;
}

void browserHistoryFree(BrowserHistory* obj) {
    free(obj);
}


/**
 * Your BrowserHistory struct will be instantiated and called as such:
 * BrowserHistory* obj = browserHistoryCreate(homepage);
 * browserHistoryVisit(obj, url);
 
 * char* param_2 = browserHistoryBack(obj, steps);
 
 * char* param_3 = browserHistoryForward(obj, steps);
 
 * browserHistoryFree(obj);
*/
