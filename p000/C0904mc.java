package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0904mc extends AbstractC0513c3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f24807d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wf2 f24808e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f24809f;

    public C0904mc(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, wf2 wf2Var, ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2) {
        this.f24807d = viewTreeObserverOnGlobalLayoutListenerC1140sc;
        this.f24808e = wf2Var;
        this.f24809f = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p000.AbstractC0513c3
    /* JADX INFO: renamed from: b */
    public final void mo3838b(View view, C1242v3 c1242v3) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1242v3.f32353a;
        this.f15777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f24807d;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30149w;
        if (viewOnAttachStateChangeListenerC1400zc.m13493o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        wf2 wf2Var = this.f24808e;
        wf2 wf2VarM12295v = wf2Var.m12295v();
        while (true) {
            if (wf2VarM12295v == null) {
                wf2VarM12295v = null;
                break;
            } else if (wf2VarM12295v.f33299G.m8671i(8)) {
                break;
            } else {
                wf2VarM12295v = wf2VarM12295v.m12295v();
            }
        }
        Integer numValueOf = wf2VarM12295v != null ? Integer.valueOf(wf2VarM12295v.f33312b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC1140sc.getSemanticsOwner().m7810a().f21014f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c1242v3.f32354b = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2 = this.f24809f;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC1140sc2, iIntValue);
        int i = wf2Var.f33312b;
        int iM7293d = viewOnAttachStateChangeListenerC1400zc.f35939B.m7293d(i);
        if (iM7293d != -1) {
            AbstractC0492bi abstractC0492biM13856T = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui(), iM7293d);
            if (abstractC0492biM13856T != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC0492biM13856T);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC1140sc2, iM7293d);
            }
            viewTreeObserverOnGlobalLayoutListenerC1140sc.m10610c(i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC1400zc.f35941D);
        }
        int iM7293d2 = viewOnAttachStateChangeListenerC1400zc.f35940C.m7293d(i);
        if (iM7293d2 != -1) {
            AbstractC0492bi abstractC0492biM13856T2 = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui(), iM7293d2);
            if (abstractC0492biM13856T2 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC0492biM13856T2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC1140sc2, iM7293d2);
            }
            viewTreeObserverOnGlobalLayoutListenerC1140sc.m10610c(i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC1400zc.f35942E);
        }
    }
}
