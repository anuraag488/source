package p000;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class u60 {

    /* JADX INFO: renamed from: a */
    public static final List f31668a = kx5.m7694Y("switchcam", "cameraswitch");

    /* JADX INFO: renamed from: a */
    public static final AccessibilityNodeInfo m11263a(AccessibilityNodeInfo accessibilityNodeInfo) {
        String strM9042W;
        AccessibilityNodeInfo accessibilityNodeInfoM11263a;
        String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
        if (viewIdResourceName != null) {
            int iM6343i0 = hd4.m6343i0(viewIdResourceName, ":id/", 0, false, 6);
            if (iM6343i0 != -1) {
                viewIdResourceName = viewIdResourceName.substring(4 + iM6343i0, viewIdResourceName.length());
            }
            strM9042W = od4.m9042W(viewIdResourceName.toLowerCase(Locale.ROOT), "_", "");
        } else {
            strM9042W = null;
        }
        if (accessibilityNodeInfo.isVisibleToUser() && strM9042W != null) {
            List list = f31668a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (hd4.m6335a0(strM9042W, (String) it.next(), false)) {
                        AccessibilityNodeInfo accessibilityNodeInfoM10740u = se0.m10740u(accessibilityNodeInfo);
                        if (accessibilityNodeInfoM10740u != null) {
                            return accessibilityNodeInfoM10740u;
                        }
                        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent();
                        while (parent != null && !parent.isClickable()) {
                            parent = parent.getParent();
                        }
                        return parent;
                    }
                }
            }
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null && (accessibilityNodeInfoM11263a = m11263a(child)) != null) {
                return accessibilityNodeInfoM11263a;
            }
        }
        return null;
    }
}
