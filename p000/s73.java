package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class s73 {

    /* JADX INFO: renamed from: a */
    public static final long f29942a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f29943b = 0;

    static {
        cm4[] cm4VarArr = bm4.f15418b;
        f29942a = bm4.f15419c;
    }

    /* JADX INFO: renamed from: a */
    public static final r73 m10546a(r73 r73Var, int i, int i2, long j, al4 al4Var, mb3 mb3Var, dl2 dl2Var, int i3, int i4, ol4 ol4Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        al4 al4Var2 = al4Var;
        mb3 mb3Var2 = mb3Var;
        dl2 dl2Var2 = dl2Var;
        int i7 = i3;
        int i8 = i4;
        ol4 ol4Var2 = ol4Var;
        if (i5 == 0 || i5 == r73Var.f29064a) {
            cm4[] cm4VarArr = bm4.f15418b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (bm4.m3632b(j3, r73Var.f29066c)) {
                }
            }
            if ((al4Var2 == null || al4Var2.equals(r73Var.f29067d)) && ((i6 == 0 || i6 == r73Var.f29065b) && ((mb3Var2 == null || mb3Var2.equals(r73Var.f29068e)) && ((dl2Var2 == null || dl2Var2.equals(r73Var.f29069f)) && ((i7 == 0 || i7 == r73Var.f29070g) && ((i8 == 0 || i8 == r73Var.f29071h) && (ol4Var2 == null || ol4Var2.equals(r73Var.f29072i)))))))) {
                return r73Var;
            }
        } else {
            j2 = 0;
        }
        cm4[] cm4VarArr2 = bm4.f15418b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = r73Var.f29066c;
        }
        if (al4Var2 == null) {
            al4Var2 = r73Var.f29067d;
        }
        if (i5 == 0) {
            i5 = r73Var.f29064a;
        }
        if (i6 == 0) {
            i6 = r73Var.f29065b;
        }
        mb3 mb3Var3 = r73Var.f29068e;
        if (mb3Var3 != null && mb3Var2 == null) {
            mb3Var2 = mb3Var3;
        }
        if (dl2Var2 == null) {
            dl2Var2 = r73Var.f29069f;
        }
        if (i7 == 0) {
            i7 = r73Var.f29070g;
        }
        if (i8 == 0) {
            i8 = r73Var.f29071h;
        }
        if (ol4Var2 == null) {
            ol4Var2 = r73Var.f29072i;
        }
        return new r73(i5, i6, j3, al4Var2, mb3Var2, dl2Var2, i7, i8, ol4Var2);
    }
}
