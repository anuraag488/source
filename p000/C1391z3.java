package p000;

import android.view.accessibility.AccessibilityEvent;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1391z3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35729a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f35730b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35731c;

    public /* synthetic */ C1391z3(byte b) {
        this.f35729a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        boolean zM10861W0;
        switch (this.f35729a) {
            case 0:
                int i = this.f35730b;
                yp1 yp1Var = (yp1) this.f35731c;
                AccessibilityEvent accessibilityEvent = (AccessibilityEvent) obj;
                if ((i & accessibilityEvent.getEventType()) == accessibilityEvent.getEventType()) {
                    yp1Var.invoke(accessibilityEvent);
                }
                return ju4.f22634a;
            case 1:
                ql3 ql3Var = (ql3) this.f35731c;
                zM10861W0 = ((sl1) obj).m10861W0(this.f35730b);
                ql3Var.f28555a = Boolean.valueOf(zM10861W0);
                break;
            case 2:
                lu2 lu2Var = (lu2) this.f35731c;
                int i2 = this.f35730b;
                db4 db4VarMo7284a = lu2Var.mo7284a();
                C0720hc c0720hc = new C0720hc((byte) 7);
                c0720hc.f20474b = i2;
                VarHandle.storeStoreFence();
                sq4 sq4Var = k91.f23003a;
                p91 p91VarM9439a = new p91(new cp4((xc1) null, new t74(new j91(c0720hc, (byte) 0), db4VarMo7284a), (z70) null, (rv3) null, (LinkedHashMap) null, 125)).m9439a(k91.m7438c(lu2Var.mo7288e(), 2));
                db4 db4VarMo7284a2 = lu2Var.mo7284a();
                C0720hc c0720hc2 = new C0720hc((byte) 6);
                c0720hc2.f20474b = i2;
                VarHandle.storeStoreFence();
                return new km0(p91VarM9439a, new mc1(new cp4((xc1) null, new t74(new j91(c0720hc2, (byte) 2), db4VarMo7284a2), (z70) null, (rv3) null, (LinkedHashMap) null, 125)).m8273a(k91.m7439d(lu2Var.mo7288e(), 2)));
            default:
                zM10861W0 = ((List) obj).addAll(this.f35730b, (Collection) this.f35731c);
                break;
        }
        return Boolean.valueOf(zM10861W0);
    }
}
