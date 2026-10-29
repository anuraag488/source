package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ga4 extends t30 {

    /* JADX INFO: renamed from: a */
    public final long f19691a;

    public ga4(long j) {
        this.f19691a = j;
    }

    @Override // p000.t30
    /* JADX INFO: renamed from: a */
    public final void mo5948a(float f, long j, C1253ve c1253ve) {
        c1253ve.m11879i(1.0f);
        long jM9464c = this.f19691a;
        if (f != 1.0f) {
            jM9464c = pb0.m9464c(jM9464c, pb0.m9465d(jM9464c) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        c1253ve.m11881k(jM9464c);
        if (((Shader) c1253ve.f32550c) != null) {
            c1253ve.f32550c = null;
            ((Paint) c1253ve.f32549b).setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga4)) {
            return false;
        }
        long j = ((ga4) obj).f19691a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f19691a, j);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f19691a);
    }

    public final String toString() {
        return zi4.m13621u("SolidColor(value=", pb0.m9470i(this.f19691a), ")");
    }
}
