package p000;

import android.os.IBinder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ny5 {

    /* JADX INFO: renamed from: a */
    public String f26202a;

    /* JADX INFO: renamed from: b */
    public String f26203b;

    /* JADX INFO: renamed from: c */
    public Map f26204c;

    /* JADX INFO: renamed from: d */
    public IBinder f26205d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ny5)) {
            return false;
        }
        ny5 ny5Var = (ny5) obj;
        if (!this.f26202a.equals(ny5Var.f26202a) || !this.f26203b.equals(ny5Var.f26203b) || !this.f26204c.equals(ny5Var.f26204c)) {
            return false;
        }
        IBinder iBinder = this.f26205d;
        IBinder iBinder2 = ny5Var.f26205d;
        if (iBinder == null) {
            return iBinder2 == null;
        }
        return iBinder.equals(iBinder2);
    }

    public final int hashCode() {
        int iHashCode = ((((this.f26202a.hashCode() ^ 1000003) * 1000003) ^ this.f26203b.hashCode()) * 1000003) ^ this.f26204c.hashCode();
        IBinder iBinder = this.f26205d;
        return (iBinder == null ? 0 : iBinder.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        IBinder iBinder = this.f26205d;
        String string = this.f26204c.toString();
        String strValueOf = String.valueOf(iBinder);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.f26202a);
        sb.append(", referrer=");
        zi4.m13599B(sb, this.f26203b, ", extraQueryParams=", string, ", windowToken=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
