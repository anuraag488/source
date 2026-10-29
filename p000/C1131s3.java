package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1131s3 {

    /* JADX INFO: renamed from: c */
    public static final C1131s3 f29844c;

    /* JADX INFO: renamed from: d */
    public static final C1131s3 f29845d;

    /* JADX INFO: renamed from: e */
    public static final C1131s3 f29846e;

    /* JADX INFO: renamed from: f */
    public static final C1131s3 f29847f;

    /* JADX INFO: renamed from: g */
    public static final C1131s3 f29848g;

    /* JADX INFO: renamed from: h */
    public static final C1131s3 f29849h;

    /* JADX INFO: renamed from: i */
    public static final C1131s3 f29850i;

    /* JADX INFO: renamed from: j */
    public static final C1131s3 f29851j;

    /* JADX INFO: renamed from: a */
    public final Object f29852a;

    /* JADX INFO: renamed from: b */
    public final int f29853b;

    /* JADX WARN: Code duplicated, block: B:14:0x01ba  */
    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        new C1131s3(null, 1, null, null);
        new C1131s3(null, 2, null, null);
        new C1131s3(null, 4, null, null);
        new C1131s3(null, 8, null, null);
        new C1131s3(null, 16, null, null);
        new C1131s3(null, 32, null, null);
        f29844c = new C1131s3(null, 64, null, null);
        f29845d = new C1131s3(null, 128, null, null);
        new C1131s3(null, 256, null, AbstractC0896m4.class);
        new C1131s3(null, 512, null, AbstractC0896m4.class);
        new C1131s3(null, 1024, null, AbstractC0933n4.class);
        new C1131s3(null, 2048, null, AbstractC0933n4.class);
        f29846e = new C1131s3(null, 4096, null, null);
        f29847f = new C1131s3(null, 8192, null, null);
        new C1131s3(null, 16384, null, null);
        new C1131s3(null, 32768, null, null);
        new C1131s3(null, 65536, null, null);
        new C1131s3(null, 131072, null, AbstractC1095r4.class);
        new C1131s3(null, 262144, null, null);
        new C1131s3(null, 524288, null, null);
        new C1131s3(null, 1048576, null, null);
        new C1131s3(null, 2097152, null, AbstractC1132s4.class);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC1021p4.class);
        f29848g = new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f29849h = new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f29850i = new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f29851j = new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC1058q4.class);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, AbstractC0970o4.class);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null);
        new C1131s3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null);
        int i = Build.VERSION.SDK_INT;
        new C1131s3(i >= 34 ? AbstractC0561d3.m4328b() : null, R.id.accessibilityActionScrollInDirection, null, null);
        int i2 = m40.f24627a;
        if (i < 36) {
            accessibilityAction = null;
        } else {
            if ((i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            } else {
                accessibilityAction = null;
            }
        }
        new C1131s3(accessibilityAction, R.id.ALT, null, null);
    }

    public C1131s3(Object obj, int i, CharSequence charSequence, Class cls) {
        this.f29853b = i;
        if (obj == null) {
            this.f29852a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f29852a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1131s3)) {
            return false;
        }
        Object obj2 = ((C1131s3) obj).f29852a;
        Object obj3 = this.f29852a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f29852a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM11712c = C1242v3.m11712c(this.f29853b);
        if (strM11712c.equals("ACTION_UNKNOWN")) {
            Object obj = this.f29852a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM11712c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM11712c);
        return sb.toString();
    }

    public C1131s3(int i, String str) {
        this(null, i, str, null);
    }
}
