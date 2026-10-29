package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rx4 extends qx4 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f29709d;

    /* JADX INFO: renamed from: e */
    public final Parcel f29710e;

    /* JADX INFO: renamed from: f */
    public final int f29711f;

    /* JADX INFO: renamed from: g */
    public final int f29712g;

    /* JADX INFO: renamed from: h */
    public final String f29713h;

    /* JADX INFO: renamed from: i */
    public int f29714i;

    /* JADX INFO: renamed from: j */
    public int f29715j;

    /* JADX INFO: renamed from: k */
    public int f29716k;

    public rx4(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0805jo(0), new C0805jo(0), new C0805jo(0));
    }

    @Override // p000.qx4
    /* JADX INFO: renamed from: a */
    public final rx4 mo10157a() {
        Parcel parcel = this.f29710e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f29715j;
        if (i == this.f29711f) {
            i = this.f29712g;
        }
        return new rx4(parcel, iDataPosition, i, zi4.m13623w(new StringBuilder(), this.f29713h, "  "), this.f28869a, this.f28870b, this.f28871c);
    }

    @Override // p000.qx4
    /* JADX INFO: renamed from: e */
    public final boolean mo10161e(int i) {
        while (true) {
            int i2 = this.f29715j;
            int i3 = this.f29716k;
            if (i2 >= this.f29712g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f29715j;
            Parcel parcel = this.f29710e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f29716k = parcel.readInt();
            this.f29715j += i5;
        }
    }

    @Override // p000.qx4
    /* JADX INFO: renamed from: h */
    public final void mo10164h(int i) {
        int i2 = this.f29714i;
        SparseIntArray sparseIntArray = this.f29709d;
        Parcel parcel = this.f29710e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f29714i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public rx4(Parcel parcel, int i, int i2, String str, C0805jo c0805jo, C0805jo c0805jo2, C0805jo c0805jo3) {
        this.f28869a = c0805jo;
        this.f28870b = c0805jo2;
        this.f28871c = c0805jo3;
        this.f29709d = new SparseIntArray();
        this.f29714i = -1;
        this.f29716k = -1;
        this.f29710e = parcel;
        this.f29711f = i;
        this.f29712g = i2;
        this.f29715j = i;
        this.f29713h = str;
    }
}
