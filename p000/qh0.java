package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public int f28462u;

    /* JADX INFO: renamed from: v */
    public int f28463v;

    /* JADX INFO: renamed from: w */
    public int f28464w;

    /* JADX INFO: renamed from: x */
    public boolean f28465x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f28466y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ rh0 f28467z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(rh0 rh0Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28467z = rh0Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        qh0 qh0Var = new qh0(this.f28467z, wm0Var);
        qh0Var.f28466y = obj;
        return qh0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((qh0) create((wm0) obj2, (b24) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        b24 b24Var;
        int i;
        int i2;
        int i3;
        String strM13618r;
        int i4;
        int i5;
        String str;
        rh0 rh0Var = this.f28467z;
        cw2 cw2Var = rh0Var.f29279a;
        kv2 kv2Var = rh0Var.f29281c;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f28465x;
        if (!z) {
            k43.m7376J(obj);
            b24Var = (b24) this.f28466y;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f28464w;
            i2 = this.f28463v;
            i3 = this.f28462u;
            b24Var = (b24) this.f28466y;
            k43.m7376J(obj);
        }
        if (i3 >= Math.min(rh0Var.f29282d + 10, kv2Var.f23538b)) {
            return ju4.f22634a;
        }
        int i6 = i3 + 1;
        int iM7635c = kv2Var.m7635c(i3);
        switch (iM7635c) {
            case 0:
                strM13618r = "up";
                break;
            case 1:
                Object objM4206g = cw2Var.m4206g(i2);
                i2++;
                strM13618r = "down " + objM4206g;
                break;
            case 2:
                strM13618r = zi4.m13618r(kv2Var.m7635c(i6), kv2Var.m7635c(i3 + 2), "remove ", " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iM7635c2 = kv2Var.m7635c(i6);
                int iM7635c3 = kv2Var.m7635c(i3 + 2);
                int iM7635c4 = kv2Var.m7635c(i3 + 3);
                StringBuilder sbM13624x = zi4.m13624x("move ", iM7635c2, " ", iM7635c3, " ");
                sbM13624x.append(iM7635c4);
                strM13618r = sbM13624x.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strM13618r = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iM7635c5 = kv2Var.m7635c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iM7635c5 + " " + cw2Var.m4206g(i2);
                int i7 = i4;
                strM13618r = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iM7635c6 = kv2Var.m7635c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iM7635c6 + " " + cw2Var.m4206g(i2);
                int i8 = i4;
                strM13618r = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objM4206g2 = cw2Var.m4206g(i2);
                as4.m3259r(2, objM4206g2);
                i2 += 2;
                strM13618r = "apply " + ((mq1) objM4206g2);
                break;
            case 8:
                strM13618r = "reuse " + rh0Var.f29280b.m4206g(i);
                i++;
                break;
            case 9:
                strM13618r = "recompose pending";
                break;
            default:
                strM13618r = c75.m3877i(iM7635c, "unknown op: ");
                break;
        }
        this.f28466y = b24Var;
        this.f28462u = i6;
        this.f28463v = i2;
        this.f28464w = i;
        this.f28465x = true;
        b24Var.m3411c(i3 + ": " + strM13618r, this);
        return ap0Var;
    }
}
