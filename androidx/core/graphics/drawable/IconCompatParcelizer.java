package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.C1077qn;
import p000.qx4;
import p000.rx4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(qx4 qx4Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14665a = -1;
        iconCompat.f14667c = null;
        iconCompat.f14668d = null;
        iconCompat.f14669e = 0;
        iconCompat.f14670f = 0;
        iconCompat.f14671g = null;
        iconCompat.f14672h = IconCompat.f14664k;
        iconCompat.f14673i = null;
        iconCompat.f14665a = !qx4Var.mo10161e(1) ? -1 : ((rx4) qx4Var).f29710e.readInt();
        byte[] bArr = iconCompat.f14667c;
        if (qx4Var.mo10161e(2)) {
            Parcel parcel = ((rx4) qx4Var).f29710e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f14667c = bArr;
        iconCompat.f14668d = qx4Var.m10162f(iconCompat.f14668d, 3);
        int i2 = iconCompat.f14669e;
        if (qx4Var.mo10161e(4)) {
            i2 = ((rx4) qx4Var).f29710e.readInt();
        }
        iconCompat.f14669e = i2;
        int i3 = iconCompat.f14670f;
        if (qx4Var.mo10161e(5)) {
            i3 = ((rx4) qx4Var).f29710e.readInt();
        }
        iconCompat.f14670f = i3;
        iconCompat.f14671g = (ColorStateList) qx4Var.m10162f(iconCompat.f14671g, 6);
        String string = iconCompat.f14673i;
        if (qx4Var.mo10161e(7)) {
            string = ((rx4) qx4Var).f29710e.readString();
        }
        iconCompat.f14673i = string;
        String string2 = iconCompat.f14674j;
        if (qx4Var.mo10161e(8)) {
            string2 = ((rx4) qx4Var).f29710e.readString();
        }
        iconCompat.f14674j = string2;
        iconCompat.f14672h = PorterDuff.Mode.valueOf(iconCompat.f14673i);
        switch (iconCompat.f14665a) {
            case -1:
                Parcelable parcelable = iconCompat.f14668d;
                if (parcelable != null) {
                    iconCompat.f14666b = parcelable;
                    return iconCompat;
                }
                C1077qn.m9987m("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f14668d;
                if (parcelable2 != null) {
                    iconCompat.f14666b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f14667c;
                iconCompat.f14666b = bArr3;
                iconCompat.f14665a = 3;
                iconCompat.f14669e = 0;
                iconCompat.f14670f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f14667c, Charset.forName("UTF-16"));
                iconCompat.f14666b = str;
                if (iconCompat.f14665a == 2 && iconCompat.f14674j == null) {
                    iconCompat.f14674j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f14666b = iconCompat.f14667c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, qx4 qx4Var) {
        qx4Var.getClass();
        iconCompat.f14673i = iconCompat.f14672h.name();
        switch (iconCompat.f14665a) {
            case -1:
                iconCompat.f14668d = (Parcelable) iconCompat.f14666b;
                break;
            case 1:
            case 5:
                iconCompat.f14668d = (Parcelable) iconCompat.f14666b;
                break;
            case 2:
                iconCompat.f14667c = ((String) iconCompat.f14666b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f14667c = (byte[]) iconCompat.f14666b;
                break;
            case 4:
            case 6:
                iconCompat.f14667c = iconCompat.f14666b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f14665a;
        if (-1 != i) {
            qx4Var.mo10164h(1);
            ((rx4) qx4Var).f29710e.writeInt(i);
        }
        byte[] bArr = iconCompat.f14667c;
        if (bArr != null) {
            qx4Var.mo10164h(2);
            Parcel parcel = ((rx4) qx4Var).f29710e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f14668d;
        if (parcelable != null) {
            qx4Var.mo10164h(3);
            ((rx4) qx4Var).f29710e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f14669e;
        if (i2 != 0) {
            qx4Var.mo10164h(4);
            ((rx4) qx4Var).f29710e.writeInt(i2);
        }
        int i3 = iconCompat.f14670f;
        if (i3 != 0) {
            qx4Var.mo10164h(5);
            ((rx4) qx4Var).f29710e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f14671g;
        if (colorStateList != null) {
            qx4Var.mo10164h(6);
            ((rx4) qx4Var).f29710e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f14673i;
        if (str != null) {
            qx4Var.mo10164h(7);
            ((rx4) qx4Var).f29710e.writeString(str);
        }
        String str2 = iconCompat.f14674j;
        if (str2 != null) {
            qx4Var.mo10164h(8);
            ((rx4) qx4Var).f29710e.writeString(str2);
        }
    }
}
