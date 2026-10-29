package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1177tc implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31065a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ViewOnAttachStateChangeListenerC1400zc f31066b;

    public /* synthetic */ C1177tc(byte b) {
        this.f31065a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f31065a;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f31066b;
        switch (b) {
            case 0:
                View view = viewOnAttachStateChangeListenerC1400zc.f35951d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                viewOnAttachStateChangeListenerC1400zc.m13495t((sx3) obj);
                return ju4.f22634a;
        }
    }
}
