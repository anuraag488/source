package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0477b3 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public AbstractC0513c3 f15047a;

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f15047a.f15777a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ar3 ar3VarMo3837a = this.f15047a.mo3837a(view);
        if (ar3VarMo3837a != null) {
            return (AccessibilityNodeProvider) ar3VarMo3837a.f14813b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f15047a.f15777a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C1242v3 c1242v3 = new C1242v3();
        c1242v3.f32354b = -1;
        c1242v3.f32355c = -1;
        c1242v3.f32353a = accessibilityNodeInfo;
        VarHandle.storeStoreFence();
        int i = cy4.f16619a;
        accessibilityNodeInfo.setScreenReaderFocusable(ay4.m3372c(view));
        accessibilityNodeInfo.setHeading(ay4.m3371b(view));
        accessibilityNodeInfo.setPaneTitle(ay4.m3370a(view));
        accessibilityNodeInfo.setStateDescription(by4.m3761b(view));
        this.f15047a.mo3838b(view, c1242v3);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(C0995R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1242v3.m11713a((C1131s3) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f15047a.f15777a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f15047a.f15777a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        AbstractC0513c3 abstractC0513c3 = this.f15047a;
        abstractC0513c3.getClass();
        List list = (List) view.getTag(C0995R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1131s3) list.get(i2)).f29852a).getId() != i; i2++) {
        }
        boolean zPerformAccessibilityAction = abstractC0513c3.f15777a.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != C0995R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C0995R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f15047a.f15777a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f15047a.f15777a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
