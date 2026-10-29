package essentials.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.ListIterator;
import p000.C1017p0;
import p000.C1354y3;
import p000.hj0;
import p000.k43;
import p000.k44;
import p000.nc4;
import p000.ow1;
import p000.pg0;
import p000.ui0;
import p000.w94;
import p000.xn2;
import p000.yp1;
import p000.zi0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EsAccessibilityService extends AccessibilityService {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f18443d = 0;

    /* JADX INFO: renamed from: a */
    public C1354y3 f18444a;

    /* JADX INFO: renamed from: b */
    public zi0 f18445b;

    /* JADX INFO: renamed from: c */
    public xn2 f18446c;

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        w94 w94Var;
        C1354y3 c1354y3 = this.f18444a;
        if (c1354y3 == null || (w94Var = c1354y3.f34829b) == null) {
            return;
        }
        int size = w94Var.size();
        for (int i = 0; i < size; i++) {
            ((yp1) w94Var.get(i)).invoke(accessibilityEvent);
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final boolean onKeyEvent(KeyEvent keyEvent) {
        w94 w94Var;
        C1354y3 c1354y3 = this.f18444a;
        boolean z = false;
        if (c1354y3 != null && (w94Var = c1354y3.f34830c) != null && !w94Var.isEmpty()) {
            ListIterator listIterator = w94Var.listIterator();
            while (true) {
                ow1 ow1Var = (ow1) listIterator;
                if (!ow1Var.hasNext()) {
                    break;
                }
                if (((Boolean) ((yp1) ow1Var.next()).invoke(keyEvent)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        xn2 xn2Var = this.f18446c;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on key event " + z + " " + keyEvent, null);
            }
        }
        return z;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        nc4 nc4Var = hj0.f20619a;
        ui0 ui0Var = (ui0) ((EsApp) getApplicationContext()).f18452b.getValue();
        C1017p0 c1017p0 = new C1017p0((byte) 16);
        c1017p0.f27254b = this;
        VarHandle.storeStoreFence();
        this.f18445b = k43.m7373G(ui0Var, new pg0(91742535, true, c1017p0));
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        zi0 zi0Var = this.f18445b;
        if (zi0Var != null) {
            zi0Var.mo8488a();
        }
        return super.onUnbind(intent);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }
}
