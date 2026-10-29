package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jm5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<jm5> CREATOR = new C1280w4((byte) 24);

    /* JADX INFO: renamed from: d */
    public final int f22432d;

    /* JADX INFO: renamed from: e */
    public final Account f22433e;

    /* JADX INFO: renamed from: f */
    public final int f22434f;

    /* JADX INFO: renamed from: g */
    public final GoogleSignInAccount f22435g;

    public jm5(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f22432d = i;
        this.f22433e = account;
        this.f22434f = i2;
        this.f22435g = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f22432d);
        oh6.m9087L(parcel, 2, this.f22433e, i);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f22434f);
        oh6.m9087L(parcel, 4, this.f22435g, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
