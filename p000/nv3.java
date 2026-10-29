package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nv3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ArrayList f26112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f26113b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ArrayList f26114c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ vi3 f26115d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ ArrayList f26116e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f26117f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f26118g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ a05 f26119h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ fe4 f26120i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f26121j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ int f26122k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ ArrayList f26123l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Integer f26124m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Integer f26125n;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ArrayList arrayList = this.f26112a;
        ArrayList arrayList2 = this.f26113b;
        ArrayList arrayList3 = this.f26114c;
        vi3 vi3Var = this.f26115d;
        ArrayList arrayList4 = this.f26116e;
        int i = this.f26117f;
        int i2 = this.f26118g;
        a05 a05Var = this.f26119h;
        fe4 fe4Var = this.f26120i;
        int i3 = this.f26121j;
        int i4 = this.f26122k;
        ArrayList arrayList5 = this.f26123l;
        Integer num = this.f26124m;
        Integer num2 = this.f26125n;
        cb3 cb3Var = (cb3) obj;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            cb3Var.m3952k((db3) arrayList.get(i5), 0, 0, 1.0f);
            i5++;
            arrayList = arrayList;
            i = i;
        }
        int i6 = i;
        int i7 = 0;
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            cb3Var.m3952k((db3) arrayList2.get(i8), i7, i7, 0.0f);
            i8++;
            size2 = size2;
            i7 = 0;
        }
        int i9 = 0;
        for (int size3 = arrayList3.size(); i9 < size3; size3 = size3) {
            cb3Var.m3952k((db3) arrayList3.get(i9), ((a05Var.mo12d(fe4Var, fe4Var.getLayoutDirection()) + (i6 - i2)) - a05Var.mo11c(fe4Var, fe4Var.getLayoutDirection())) / 2, i3 - i4, 2.0f);
            i9++;
        }
        if (vi3Var != null) {
            int size4 = arrayList5.size();
            for (int i10 = 0; i10 < size4; i10++) {
                cb3Var.m3952k((db3) arrayList5.get(i10), vi3Var.f32649b, i3 - num.intValue(), 4.0f);
            }
        }
        int size5 = arrayList4.size();
        for (int i11 = 0; i11 < size5; i11++) {
            cb3Var.m3952k((db3) arrayList4.get(i11), 0, i3 - (num2 != null ? num2.intValue() : 0), 3.0f);
        }
        return ju4.f22634a;
    }
}
