export interface Student{
    id: number;
    name: string;
    contact: number;
    intro: string;
    subject: Array<string>;
}

export const students = [
    {
        id:101,
        name:'Rajesh',
        contact: 12345,
        intro: 'This is Rajest, i am a good student!',
        subject: ['cs','ec','it']
    },
    {
        id:102,
        name:'Tom',
        contact: 12345,
        intro: 'This is Tom, i am a good student!',
        subject: ['cs','ec','it']
    },
    {
        id:103,
        name:'Harry',
        contact: 12345,
        intro: 'This is Harry, i am a good student!',
        subject: ['cs','it']
    }
];