package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.qx4;
import p000.rx4;
import p000.sx4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(qx4 qx4Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        sx4 sx4VarM10163g = remoteActionCompat.f14658a;
        boolean z = true;
        if (qx4Var.mo10161e(1)) {
            sx4VarM10163g = qx4Var.m10163g();
        }
        remoteActionCompat.f14658a = (IconCompat) sx4VarM10163g;
        CharSequence charSequence = remoteActionCompat.f14659b;
        if (qx4Var.mo10161e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rx4) qx4Var).f29710e);
        }
        remoteActionCompat.f14659b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f14660c;
        if (qx4Var.mo10161e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rx4) qx4Var).f29710e);
        }
        remoteActionCompat.f14660c = charSequence2;
        remoteActionCompat.f14661d = (PendingIntent) qx4Var.m10162f(remoteActionCompat.f14661d, 4);
        boolean z2 = remoteActionCompat.f14662e;
        if (qx4Var.mo10161e(5)) {
            z2 = ((rx4) qx4Var).f29710e.readInt() != 0;
        }
        remoteActionCompat.f14662e = z2;
        boolean z3 = remoteActionCompat.f14663f;
        if (!qx4Var.mo10161e(6)) {
            z = z3;
        } else if (((rx4) qx4Var).f29710e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f14663f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, qx4 qx4Var) {
        qx4Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f14658a;
        qx4Var.mo10164h(1);
        qx4Var.m10165i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f14659b;
        qx4Var.mo10164h(2);
        Parcel parcel = ((rx4) qx4Var).f29710e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f14660c;
        qx4Var.mo10164h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f14661d;
        qx4Var.mo10164h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f14662e;
        qx4Var.mo10164h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f14663f;
        qx4Var.mo10164h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
