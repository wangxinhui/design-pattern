package com.compositePattern.demo;

public class Client {
    public static void main(String[] args) {
        //��Գ��󹹼����
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
        folder1	=	new	Folder("Sunny������");
        folder2	=	new	Folder("ͼ���ļ�");
        folder3	=	new	Folder("�ı��ļ�");
        folder4	=	new	Folder("��Ƶ�ļ�");
        file1	=	new	ImageFile("С��Ů.jpg");
        file2	=	new	ImageFile("���޼�.gif");
        file3	=	new	TextFile("�����澭.txt");
        file4	=	new	TextFile("��������.doc");
        file5	=	new	VideoFile("Ц������.rmvb");
        folder2.addFile(file2);
        folder2.addFile(file1);
        folder3.addFile(file3);
        folder3.addFile(file4);
        folder4.addFile(file5);
        folder1.addFile(folder3);
        folder1.addFile(folder2);
        folder1.addFile(folder4);
        //�ӡ�Sunny�����ϡ��ڵ㿪ʼ����ɱ������
        folder1.killVirus();
    }
}