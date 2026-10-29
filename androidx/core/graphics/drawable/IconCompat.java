package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p000.C1077qn;
import p000.wb1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f14664k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f14665a;

    /* JADX INFO: renamed from: b */
    public Object f14666b;

    /* JADX INFO: renamed from: c */
    public byte[] f14667c;

    /* JADX INFO: renamed from: d */
    public Parcelable f14668d;

    /* JADX INFO: renamed from: e */
    public int f14669e;

    /* JADX INFO: renamed from: f */
    public int f14670f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f14671g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f14672h;

    /* JADX INFO: renamed from: i */
    public String f14673i;

    /* JADX INFO: renamed from: j */
    public String f14674j;

    /* JADX INFO: renamed from: a */
    public static IconCompat m3055a(int i) {
        if (i == 0) {
            C1077qn.m9987m("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14667c = null;
        iconCompat.f14668d = null;
        iconCompat.f14670f = 0;
        iconCompat.f14671g = null;
        iconCompat.f14672h = f14664k;
        iconCompat.f14673i = null;
        iconCompat.f14665a = 2;
        iconCompat.f14669e = i;
        iconCompat.f14666b = "";
        iconCompat.f14674j = "";
        return iconCompat;
    }

    /* JADX INFO: renamed from: b */
    public final int m3056b() {
        int i = this.f14665a;
        if (i == -1) {
            return ((Icon) this.f14666b).getResId();
        }
        if (i == 2) {
            return this.f14669e;
        }
        wb1.m12196p(this, "called getResId() on ");
        return 0;
    }

    public final String toString() {
        String str;
        if (this.f14665a == -1) {
            return String.valueOf(this.f14666b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f14665a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f14665a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f14666b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f14666b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f14674j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m3056b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f14669e);
                if (this.f14670f != 0) {
                    sb.append(" off=");
                    sb.append(this.f14670f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f14666b);
                break;
        }
        if (this.f14671g != null) {
            sb.append(" tint=");
            sb.append(this.f14671g);
        }
        if (this.f14672h != f14664k) {
            sb.append(" mode=");
            sb.append(this.f14672h);
        }
        sb.append(")");
        return sb.toString();
    }
}
