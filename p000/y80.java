package p000;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y80 {

    /* JADX INFO: renamed from: a */
    public FileInputStream f35009a;

    /* JADX INFO: renamed from: b */
    public CharsetDecoder f35010b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f35011c;

    /* JADX INFO: renamed from: d */
    public boolean f35012d;

    /* JADX INFO: renamed from: e */
    public char f35013e;

    /* JADX INFO: renamed from: a */
    public final int m13047a(char[] cArr, int i, int i2) throws CharacterCodingException {
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            StringBuilder sbM13624x = zi4.m13624x("Unexpected arguments: ", i, ", ", i2, ", ");
            sbM13624x.append(cArr.length);
            throw new IllegalArgumentException(sbM13624x.toString().toString());
        }
        boolean z = this.f35012d;
        boolean z2 = true;
        if (z) {
            cArr[i] = this.f35013e;
            i++;
            i2--;
            this.f35012d = false;
            if (i2 == 0) {
                return 1;
            }
            z = false;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (z) {
                this.f35012d = false;
                c4 = this.f35013e;
            } else {
                char[] cArr2 = new char[2];
                int iM13047a = m13047a(cArr2, 0, 2);
                if (iM13047a == -1) {
                    c = 65535;
                } else if (iM13047a == 1) {
                    c2 = cArr2[0];
                } else {
                    if (iM13047a != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iM13047a).toString());
                    }
                    this.f35013e = cArr2[1];
                    this.f35012d = true;
                    c3 = cArr2[0];
                }
            }
            if (c != 65535) {
                c = c2;
                c = c3;
                c = c4;
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        ByteBuffer byteBuffer = this.f35011c;
        CharsetDecoder charsetDecoder = this.f35010b;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z3 = false;
        while (true) {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z3);
            if (coderResultDecode.isUnderflow()) {
                if (z3 || !charBuffer.hasRemaining()) {
                    z2 = z3;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f35009a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z3 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z2 = z3;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z2) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
