package p000;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class py5 implements InterfaceC1224um {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28101a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28102b;

    public /* synthetic */ py5(byte b) {
        this.f28101a = b;
    }

    @Override // p000.gd6
    /* JADX INFO: renamed from: a */
    public final void mo5973a(String str, String str2, Bundle bundle, long j) {
        switch (this.f28101a) {
            case 0:
                yg3 yg3Var = (yg3) this.f28102b;
                if (((HashSet) yg3Var.f35215b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    x12 x12Var = fv5.f19342a;
                    String strM6960c = iw5.m6960c(str2, vd6.f32545h, vd6.f32543f);
                    if (strM6960c != null) {
                        str2 = strM6960c;
                    }
                    bundle2.putString("events", str2);
                    ((z32) yg3Var.f35216c).m13313K(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !fv5.f19342a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((z32) ((bt5) this.f28102b).f15596b).m13313K(3, bundle3);
                    break;
                }
                break;
        }
    }
}
