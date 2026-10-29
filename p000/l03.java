package p000;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 l03, still in use, count: 1, list:
  (r1v0 l03) from 0x00fa: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 l03) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:251)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l03 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(9),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(12),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(13),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(14),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(15),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(16),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(17),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(18),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(19),
    /* JADX INFO: Fake field, exist only in values array */
    EF202(100);


    /* JADX INFO: renamed from: a */
    public static final SparseArray f23666a;

    static {
        SparseArray sparseArray = new SparseArray();
        f23666a = sparseArray;
        sparseArray.put(0, l03Var);
        sparseArray.put(1, l03Var);
        sparseArray.put(2, l03Var);
        sparseArray.put(3, l03Var);
        sparseArray.put(4, l03Var);
        sparseArray.put(5, l03Var);
        sparseArray.put(6, l03Var);
        sparseArray.put(7, l03Var);
        sparseArray.put(8, l03Var);
        sparseArray.put(9, l03Var);
        sparseArray.put(10, l03Var);
        sparseArray.put(11, l03Var);
        sparseArray.put(12, l03Var);
        sparseArray.put(13, l03Var);
        sparseArray.put(14, l03Var);
        sparseArray.put(15, l03Var);
        sparseArray.put(16, l03Var);
        sparseArray.put(17, l03Var);
        sparseArray.put(18, l03Var);
        sparseArray.put(19, l03Var);
    }

    public l03(int i) {
        super(str, i);
    }

    public static l03 valueOf(String str) {
        return (l03) Enum.valueOf(l03.class, str);
    }

    public static l03[] values() {
        return (l03[]) f23667b.clone();
    }
}
