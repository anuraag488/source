package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fc6 extends mh5 implements IInterface {

    /* JADX INFO: renamed from: j */
    public final int f18910j;

    public fc6(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 4);
        y42.m12849V(bArr.length == 25);
        this.f18910j = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m5639K(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            C1077qn.m9985k(e);
            return null;
        }
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: G */
    public final boolean mo5640G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a02 a02VarM5642J = m5642J();
            parcel2.writeNoException();
            nv5.m8863b(parcel2, a02VarM5642J);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f18910j);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public abstract byte[] mo5641I();

    /* JADX INFO: renamed from: J */
    public final a02 m5642J() {
        return v23.m11711K(mo5641I());
    }

    public final boolean equals(Object obj) {
        a02 a02VarM5642J;
        if (obj instanceof fc6) {
            try {
                fc6 fc6Var = (fc6) obj;
                if (fc6Var.f18910j == this.f18910j && (a02VarM5642J = fc6Var.m5642J()) != null) {
                    return Arrays.equals(mo5641I(), (byte[]) v23.m11710J(a02VarM5642J));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18910j;
    }
}
